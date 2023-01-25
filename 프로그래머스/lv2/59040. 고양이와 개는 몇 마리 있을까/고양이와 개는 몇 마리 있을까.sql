-- 코드를 입력하세요
select ANIMAL_TYPE, count(ANIMAL_TYPE) count from ANIMAL_INS group by ANIMAL_TYPE order by ANIMAL_TYPE asc