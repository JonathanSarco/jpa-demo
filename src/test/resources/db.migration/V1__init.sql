CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS vehicles (
    id uuid DEFAULT uuid_generate_v4(),
    vehicle_type varchar(255) not null,
    brand varchar(255) not null,
    is_car boolean null,
    is_bus boolean null
);

insert into vehicles (vehicle_type, brand, is_car) values ('CAR', 'Audi', true) ON CONFLICT DO NOTHING;
insert into vehicles (vehicle_type, brand, is_car) values ('CAR', 'BMW', true) ON CONFLICT DO NOTHING;
insert into vehicles (vehicle_type, brand, is_bus) values ('BUS', 'Mercedes', true) ON CONFLICT DO NOTHING;
insert into vehicles (vehicle_type, brand, is_bus) values ('BUS', 'Scania', true) ON CONFLICT DO NOTHING;