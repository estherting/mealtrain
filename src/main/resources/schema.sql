DROP TABLE IF EXISTS app_user;

CREATE TABLE app_user (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR (50) NOT NULL,
                          email VARCHAR (50) UNIQUE,
                          is_admin BOOLEAN DEFAULT FALSE

);