create table sport
(
    id    serial primary key,
    value varchar(50) not null unique
);

create table athlete_rank
(
    id    serial primary key,
    value varchar(50) not null unique
);

create table court_surface
(
    id    serial primary key,
    value varchar(50) not null unique
);

create table sports_facility_type
(
    id    serial primary key,
    value varchar(50) not null unique
);

create table sports_facility
(
    id      serial primary key,
    address varchar(100),
    type    integer references sports_facility_type (id)
);

create table court
(
    id                 serial primary key,
    sports_facility_id integer references sports_facility (id),
    surface            integer references court_surface (id)
);

create table gym
(
    id                 serial primary key,
    sports_facility_id integer references sports_facility (id),
    floor_area         real not null
);

create table stadium
(
    id                 serial primary key,
    sports_facility_id integer references sports_facility (id),
    capacity           integer not null
);

create table arena
(
    id                 serial primary key,
    sports_facility_id integer references sports_facility (id),
    track_number       integer not null
);


create table sport_club
(
    id    serial primary key,
    title varchar(50) not null
);

create table athlete
(
    id         serial primary key,
    first_name varchar(50) not null,
    patronymic varchar(50),
    last_name  varchar(50),
    club       integer references sport_club (id)
);

create table athlete_ranking
(
    athlete_id integer references athlete (id),
    sport      integer references sport (id),
    rank       integer references athlete_rank (id),
    primary key (athlete_id, sport)
);

create table trainer
(
    id         serial primary key,
    first_name varchar(50) not null,
    patronymic varchar(50),
    last_name  varchar(50)
);

create table trainer_license
(
    id         serial not null unique,
    trainer_id integer references trainer (id),
    sport      integer references sport (id),
    primary key (trainer_id, sport)
);

create table training
(
    athlete_id         integer references athlete (id),
    trainer_license_id integer references trainer_license (id),
    primary key (athlete_id, trainer_license_id)
);

create table sponsor
(
    id      serial primary key,
    name    varchar(150),
    company varchar(50),
    check ((name is not null) or (company is not null))
);

create table competition
(
    id           serial primary key,
    title        varchar(100) not null,
    period date not null,
    main_sponsor integer references sponsor (id),
    sport        integer references sport (id),
    location     integer references sports_facility (id)
);

create table competition_player
(
    athlete_id     integer references athlete (id),
    competition_id integer references competition (id),
    was_awarding   boolean not null,
    result         integer not null,
    primary key (athlete_id, competition_id),
    check ((not was_awarding and result = 0) or (was_awarding and result > 0))
);