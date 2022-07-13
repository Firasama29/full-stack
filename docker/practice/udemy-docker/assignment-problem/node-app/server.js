const express = require('express');

const app = express();

app.get('/', (req, res) => {
  res.send(`
    <h1>Hello from inside the very basic Node app!</h1>
    <h2>this app is running using a node docker container</h2>
  `);
})

app.listen(3000);