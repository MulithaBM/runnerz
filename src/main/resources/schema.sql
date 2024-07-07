CREATE TABLE IF NOT EXISTS Run (
    id INT NOT NULL,
    title VARCHAR(250) NOT NULL,
    started_on TIMESTAMP NOT NULL,
    completed_on TIMESTAMP NOT NULL,
    distance INT NOT NULL,
    location VARCHAR(250) NOT NULL,
    version INT,
    PRIMARY KEY (id)
);