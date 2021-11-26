DROP DATABASE IF EXISTS sk_example_db;
DROP USER IF EXISTS sk_example_user;

CREATE USER sk_example_user;
CREATE DATABASE sk_example_db owner sk_example_user;

CREATE TABLE sk_example_table
(
    id  SERIAL,
    obj JSONB NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO sk_example_table (obj)
VALUES ('{
  "current": 0
}'::JSONB);
