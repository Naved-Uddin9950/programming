const ask = require('../../NPM/node_modules/prompt-sync')();
const fs = require('fs');
const express = require('../../NPM/node_modules/express');
const app = express();
const PORT = 3000;
const path = require('path');

app.get('/', (req, res) => {
    const indexPath = path.join(__dirname, 'index.html');
    res.sendFile(indexPath);
    let doc = req.query.editor;
    fs.writeFileSync('file.txt', doc, () => {
        console.log('File is saved');
    })
});

app.listen(PORT, () => {
    console.log(`Server is listening to port ${PORT}...`);
});
