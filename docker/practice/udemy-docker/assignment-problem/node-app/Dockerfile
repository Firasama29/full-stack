FROM node:14

WORKDIR /node-docker

COPY . /node-docker/

RUN npm install

EXPOSE 3000

CMD ["node", "server.js"]