SELECT substr(product_code, 1, 2) as category, count(*) as products
FROM product
GROUP BY category
ORDER BY category;