DROP TABLE IF EXISTS employees;

DROP TABLE IF EXISTS department;

CREATE TABLE department (
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(250) NOT NULL
);

CREATE TABLE employees (
   id INT AUTO_INCREMENT PRIMARY KEY,
   first_name VARCHAR(250) NOT NULL,
   last_name VARCHAR(250) NOT NULL,
   mail VARCHAR(250) NOT NULL,
   password VARCHAR(250) NOT NULL,
   birth_date DATE,
   department_id INT,
   FOREIGN KEY (department_id) REFERENCES department(id)
);

INSERT INTO employees (first_name, last_name, mail, password, birth_date, department_id) VALUES
     ('Laurent', 'GINA', 'laurentgina@mail.com', 'laurent', '1980-01-01', NULL),
     ('Sophie', 'FONCEK', 'sophiefoncek@mail.com', 'sophie', '1985-01-01', NULL),
     ('Agathe', 'FEELING', 'agathefeeling@mail.com', 'agathe', '1990-01-01', NULL);