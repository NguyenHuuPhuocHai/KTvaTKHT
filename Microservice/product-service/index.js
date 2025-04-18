const express = require('express');
const app = express();
app.use(express.json());

let products = [];
let idCounter = 1;

app.post('/products', (req, res) => {
  const product = { id: idCounter++, ...req.body };
  products.push(product);
  res.status(201).json(product);
});

app.get('/products', (req, res) => {
  res.json(products);
});

app.get('/products/:id', (req, res) => {
  const product = products.find(p => p.id == req.params.id);
  if (!product) return res.status(404).send('Not found');
  res.json(product);
});

app.listen(3001, () => {
  console.log('Product Service running on port 3001');
});
