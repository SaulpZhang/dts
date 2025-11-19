CREATE TABLE IF NOT EXISTS tbl_dts (
    id          INTEGER PRIMARY KEY,
    title       TEXT    NOT NULL,
    dts_type    INTEGER NOT NULL,
    cur_state   TEXT,
    cur_user    TEXT,
    project_id  INTEGER
);

CREATE TABLE IF NOT EXISTS tbl_dts_detail (
    id            INTEGER PRIMARY KEY,
    dts_id        INTEGER NOT NULL,
    state         TEXT,
    user_name     TEXT,
    description   TEXT,
    created_time  TEXT,
    updated_time  TEXT
);
