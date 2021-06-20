// 统一请求路径前缀在libs/axios.js中修改
import { getRequest, postRequest, putRequest, postBodyRequest, getNoAuthRequest, postNoAuthRequest } from '@/libs/axios';

// 分页获取数据
export const getSonCompanyList = (params) => {
    return getRequest('/shiChangType/getByPage', params)
}
// 添加
export const addSonCompany = (params) => {
    return postRequest('/shiChangType/insertOrUpdate', params)
}
// 编辑
export const editSonCompany = (params) => {
    return postRequest('/shiChangType/insertOrUpdate', params)
}
// 删除
export const deleteSonCompany = (params) => {
    return postRequest('/shiChangType/delByIds', params)
}