alter session set "_ORACLE_SCRIPT"=true;

create user scott identified by tiger;

grant connect,resource to goni;

alter user goni default tablespace users quota unlimited on users;