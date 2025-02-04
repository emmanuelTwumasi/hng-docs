## Number Classification API

This API classifies numbers based on mathematical properties and provides a fun fact.

### Features

- Checks if a number is prime, perfect, Armstrong
- Determines if it is even or odd
- Computes sum of its digits
- Fetches a fun fact from Numbers API
    - #### API Endpoint

```
GET /api/classify-number?number=<integer>
```

#### Example Response

```
{
"number": 371,
"is_prime": false,
"is_perfect": false,
"properties": ["armstrong", "odd"],
"digit_sum": 11,
"fun_fact": "371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371"
}
{
"number": "alphabet",
"error": true
}

```
