const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmh8649/",
            name: "ssmh8649",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmh8649/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "高校体育场管理系统"
        } 
    }
}
export default base
