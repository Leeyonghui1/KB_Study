create table person
(
    id    		  varchar(100) primary key,
    pw			  varchar(100) not null,
    pt_code       varchar(3)   not null,    
    doc_id        bigint       unsigned unique,    
    nur_id        bigint       unsigned unique,    
    pat_id        bigint       unsigned unique,       
    m_code        varchar(2)   null,     
    name          varchar(30)  not null,     
    gen           varchar(10)  not null,
    age           bigint       unsigned not null,
    phone         varchar(20)  unique,       
    po_code       varchar(3)   null
);

alter table person add constraint fk_1 foreign key(m_code) references major(m_code);

alter table person add constraint fk_2 foreign key(pt_code) references ptype(pt_code);

alter table person add constraint fk_3 foreign key(po_code) references aposition(po_code);

select * from person;
