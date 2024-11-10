CREATE DATAVASE whiteboarddb;
USE whitebaorddb;

CREATE TABLE Board (
    board_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    creator_id INT,
    -- add foreign key for User if required
    FOREIGN KEY (creator_id) REFERENCES User(user_id)
);
