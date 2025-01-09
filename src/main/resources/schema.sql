CREATE TABLE movie_details (
    movie_id INT AUTO_INCREMENT PRIMARY KEY,
    movie_title VARCHAR(255) NOT NULL,
    movie_language VARCHAR(50) NOT NULL,
    movie_release_date DATE,
    movie_image_url VARCHAR(255)
);
