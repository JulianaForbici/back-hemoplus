/* add geolocation to usuario */
alter table usuario add column if not exists latitude NUMERIC(19,4);
alter table usuario add column if not exists longitude NUMERIC(19,4);

/* remove duplicated estoque rows before unique index */
with ranked as (
    select ctid,
           row_number() over (
               partition by hemocentro, tipo_sangue, fator_rh
               order by data_atualizacao desc nulls last, id desc
           ) as rn
    from estoque
)
delete from estoque e
using ranked r
where e.ctid = r.ctid
  and r.rn > 1;

create unique index if not exists uk_estoque_hemocentro_tipo_rh
    on estoque (hemocentro, tipo_sangue, fator_rh);
