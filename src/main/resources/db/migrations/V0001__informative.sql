CREATE TABLE informative (
  id SERIAL PRIMARY KEY not null,
  subject varchar (50) not null,
  content text not null,
  author varchar (35) not null,
  create_date timestamp not null,
  expiration_date timestamp not null
);