-- name :: 시퀀스명
-- currval :: 현재값
-- bigint unsigned :: 아주 큰값, 음수없음
create table sequences
(
	name varchar(32),
    currval bigint unsigned
);