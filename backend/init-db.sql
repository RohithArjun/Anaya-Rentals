-- Create databases for each microservice
CREATE DATABASE auth_db;
CREATE DATABASE car_db;
CREATE DATABASE booking_db;
CREATE DATABASE fleet_db;


-- Grant privileges
GRANT ALL PRIVILEGES ON DATABASE auth_db TO postgres;
GRANT ALL PRIVILEGES ON DATABASE car_db TO postgres;
GRANT ALL PRIVILEGES ON DATABASE booking_db TO postgres;
GRANT ALL PRIVILEGES ON DATABASE fleet_db TO postgres;
