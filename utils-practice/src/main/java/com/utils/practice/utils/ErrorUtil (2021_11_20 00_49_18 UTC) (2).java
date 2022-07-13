package com.utils.practice.utils;

import feign.Response;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Objects;

public class ErrorUtil {

    private ErrorUtil() {}

    private static final Logger log = LoggerFactory.getLogger(ErrorUtil.class);

    public static String parseError(String methodKey, Response response) {
        log.error("response status : {}", response.status());
        log.error("request headers : {}", response.request().headers());
        log.error("response headers: [{}]", response.headers());
        log.error("error while executing [{}] on request url [{}]", methodKey, response.request().url());

        String errorResponse = StringUtils.EMPTY;
        try {
            Response.Body responseBody = response.body();
            errorResponse = Objects.nonNull(responseBody) ? IOUtils.toString(responseBody.asInputStream()) : "response body is null";
        } catch (IOException ioException) {
            log.error("unable to parse error response", ioException);
        }
        log.error("error response received from service: [{}]", errorResponse);
        return errorResponse;
    }
}
