Ext.define("system.model.User", {
			extend : "Ext.data.Model",
			fields : [ {name:'id',type:'string'},
			           {name:'name',type:'string'},
			           {name:'stuempNo',type:'string'},
			           {name:'idCard',type:'string'},
			           {name:'loginName',type:'string'},
			           {name:'password',type:'string'},
			           {name:'orgId',type:'string'},
			           {name:'orgName',type:'string'},
			           {name:'mobile',type:'string'},
			           {name:'home_phone',type:'string'},
			           {name:'office_phone',type:'string'},
			           {name:'home_address',type:'string'},
			           {name:'professional',type:'string'},
			           {name:'email',type:'string'},
			           {name:'creator',type:'string'},
			           {name:'createTime',type:'string'},
			           {name:'lastIp',type:'string'},
			           {name:'lastTime',type:'string'},
			           {name:'image',type:'string'},
			           {name:'sex',type:'int'},
			           {name:'state',type:'int'},
			           {name:'rank',type:'int'},
			           {name:'roleIds',type:'string'},
			           {name:'roleNames',type:'string'}]
		});
