package com.practice.service;

import com.practice.FileStrategy;
import com.practice.HtmlFile;
import com.practice.JsonFile;
import com.practice.XmlFile;
import com.practice.enums.FileEnum;
import org.springframework.stereotype.Service;

import java.util.Map;

import static com.practice.enums.FileEnum.HTML;
import static com.practice.enums.FileEnum.JSON;
import static com.practice.enums.FileEnum.XML;

@Service
public class FileParsesStrategyService {

    Map<FileEnum, FileStrategy> fileParsesMap = Map.of(JSON, new JsonFile(),
            XML, new XmlFile(),
            HTML, new HtmlFile());


}
