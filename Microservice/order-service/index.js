const express = require('express');
const app = express();
app.use(express.json());

let orders = [];
let idCounter = 1;

app.post('/orders', (req, res) => {
  const order = { id: idCounter++, ...req.body };
  orders.push(order);
  res.status(201).json(order);
});

app.get('/orders', (req, res) => {
  res.json(orders);
});

app.get('/orders/:id', (req, res) => {
  const order = orders.find(o => o.id == req.params.id);
  if (!order) return res.status(404).send('Not found');
  res.json(order);
});

app.listen(3003, () => {
  console.log('Order Service running on port 3003');
});
