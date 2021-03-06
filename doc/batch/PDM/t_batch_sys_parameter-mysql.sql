
insert into t_batch_sys_parameter (BATCH_SYS_PARAMETER_OID, BATCH_PARAMETER, PARAMETER_VALUE, DESCRIPTION, CREATE_BY, CREATE_DATE, UPDATE_BY, UPDATE_DATE)
values (1, 'max_threads', '5', '最大线程数', 'sysdb', now(), null, null);

insert into t_batch_sys_parameter (BATCH_SYS_PARAMETER_OID, BATCH_PARAMETER, PARAMETER_VALUE, DESCRIPTION, CREATE_BY, CREATE_DATE, UPDATE_BY, UPDATE_DATE)
values (3, 'taskRunMultiple', '10', '任务运行倍数', 'sysdb', now(), null, null);

insert into t_batch_sys_parameter (BATCH_SYS_PARAMETER_OID, BATCH_PARAMETER, PARAMETER_VALUE, DESCRIPTION, CREATE_BY, CREATE_DATE, UPDATE_BY, UPDATE_DATE)
values (4, 'threadCycleTime', '5000', '线程池轮循周期（秒）', 'sysdb', now(), null, null);

insert into t_batch_sys_parameter (BATCH_SYS_PARAMETER_OID, BATCH_PARAMETER, PARAMETER_VALUE, DESCRIPTION, CREATE_BY, CREATE_DATE, UPDATE_BY, UPDATE_DATE)
values (2, 'defaultThreadAssignNum', '5', '缺省的工作线程分配数', 'sysdb', now(), null, null);

insert into t_batch_sys_parameter (BATCH_SYS_PARAMETER_OID, BATCH_PARAMETER, PARAMETER_VALUE, DESCRIPTION, CREATE_BY, CREATE_DATE, UPDATE_BY, UPDATE_DATE)
values (5, 'threadCycleNum', '50', '线程池轮询周期数,当到达该设定值，轮询时间从初始值开始', 'sysdb', now(), null, null);


