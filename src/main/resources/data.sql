DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
   id INT AUTO_INCREMENT  PRIMARY KEY,
   first_name VARCHAR(250) NOT NULL,
   last_name VARCHAR(250) NOT NULL,
   mail VARCHAR(250) NOT NULL,
   password VARCHAR(250) NOT NULL,
   birth_date DATE
);

INSERT INTO employees (first_name, last_name, mail, password, birth_date) VALUES
  ('Laurent', 'GINA', 'laurentgina@mail.com', 'laurent', '1980-01-01'),
  ('Sophie', 'FONCEK', 'sophiefoncek@mail.com', 'sophie', '1985-01-01'),
  ('Agathe', 'FEELING', 'agathefeeling@mail.com', 'agathe', '1990-01-01');