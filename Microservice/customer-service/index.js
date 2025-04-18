const express = require('express');
const app = express();
app.use(express.json());

let customers = [];
let idCounter = 1;

app.post('/customers', (req, res) => {
  const customer = { id: idCounter++, ...req.body };
  customers.push(customer);
  res.status(201).json(customer);
});

app.get('/customers', (req, res) => {
  res.json(customers);
});

app.get('/customers/:id', (req, res) => {
  const customer = customers.find(c => c.id == req.params.id);
  if (!customer) return res.status(404).send('Not found');
  res.json(customer);
});

app.listen(3002, () => {
  console.log('Customer Service running on port 3002');
});
