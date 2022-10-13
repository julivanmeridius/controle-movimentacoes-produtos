create table produto (
   cod_produto varchar(4) not null,
   des_produto varchar(30),
   sta_status  varchar(1)
);
alter table produto add primary key (cod_produto);

create table produto_cosif (
   cod_produto       varchar(4)  not null,
   cod_cosif         varchar(11) not null,
   cod_classificacao varchar(6),
   sta_status        varchar(1)
);
alter table produto_cosif add primary key (cod_produto, cod_cosif);
alter table produto_cosif add foreign key (cod_produto) references produto (cod_produto);

create table movimento_manual (
   dat_mes        numeric     not null,
   dat_ano        numeric     not null,
   num_lancamento numeric     not null,
   cod_produto    varchar(4)  not null,
   cod_cosif      varchar(11) not null,
   des_descricao  varchar(50),
   dat_movimento  date,
   cod_usuario    varchar(15),
   val_valor      numeric(18,2)
);
alter table movimento_manual add primary key (dat_mes, dat_ano, num_lancamento, cod_produto, cod_cosif);
alter table movimento_manual add foreign key (cod_produto, cod_cosif) references produto_cosif (cod_produto,  cod_cosif);

