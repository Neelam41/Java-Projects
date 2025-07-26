-- Incorrect Join (will produce wrong results)
SELECT * FROM orders o LEFT JOIN users u ON o.id = u.id;

-- Correct Join
SELECT * FROM orders o JOIN users u ON o.user_id = u.id;
