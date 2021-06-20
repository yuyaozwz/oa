// 统一请求路径前缀在libs/axios.js中修改
import { getRequest, postRequest, putRequest, postBodyRequest, getNoAuthRequest, postNoAuthRequest } from '@/libs/axios';

// 分页获取数据
export const getSonCompanyList = (params) => {
    return getRequest('/shiChangArea/getByPage', params)
}
// 添加
export const addSonCompany = (params) => {
    return postRequest('/shiChangArea/insertOrUpdate', params)
}
// 编辑
export const editSonCompany = (params) => {
    return postRequest('/shiChangArea/insertOrUpdate', params)
}
// 删除
export const deleteSonCompany = (params) => {
    return postRequest('/shiChangArea/delByIds', params)
}