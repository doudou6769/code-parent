package com.doudou.code.bg.admin.core.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class User {
    /**
     * 用户流水ID
     */
    @Id
    @Column(name = "userId")
    @GeneratedValue(generator = "JDBC")
    private String userId;

    /**
     * 用户登录账号
     */
    @Column(name = "loginAccount")
    private String loginAccount;

    /**
     * 鐢ㄦ埛鐧诲綍瀵嗙爜
     */
    @Column(name = "loginPassword")
    private String loginPassword;

    /**
     * 创建时间
     */
    @Column(name = "crtDate")
    private Date crtDate;

    /**
     * 真实姓名
     */
    @Column(name = "nickName")
    private String nickName;

    /**
     * 最后登录时间
     */
    @Column(name = "lastLoginDate")
    private Date lastLoginDate;

    /**
     * 登录的token
     */
    @Column(name = "token")
    private String token;

    /**
     * 具体地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 所在区名称
     */
    @Column(name = "areaName")
    private String areaName;

    /**
     * 区编码
     */
    @Column(name = "area")
    private String area;

    @Column(name = "cityName")
    private String cityName;

    /**
     * 所在市
     */
    @Column(name = "city")
    private String city;

    /**
     * 所在省名称
     */
    @Column(name = "provinceName")
    private String provinceName;

    /**
     * 所在省编码
     */
    @Column(name = "province")
    private String province;

    /**
     * 用户头像图片地址
     */
    @Column(name = "headImg")
    private String headImg;

    /**
     * 获取用户流水ID
     *
     * @return userId - 用户流水ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户流水ID
     *
     * @param userId 用户流水ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户登录账号
     *
     * @return loginAccount - 用户登录账号
     */
    public String getLoginAccount() {
        return loginAccount;
    }

    /**
     * 设置用户登录账号
     *
     * @param loginAccount 用户登录账号
     */
    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    /**
     * 获取鐢ㄦ埛鐧诲綍瀵嗙爜
     *
     * @return loginPassword - 鐢ㄦ埛鐧诲綍瀵嗙爜
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * 设置鐢ㄦ埛鐧诲綍瀵嗙爜
     *
     * @param loginPassword 鐢ㄦ埛鐧诲綍瀵嗙爜
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    /**
     * 获取创建时间
     *
     * @return crtDate - 创建时间
     */
    public Date getCrtDate() {
        return crtDate;
    }

    /**
     * 设置创建时间
     *
     * @param crtDate 创建时间
     */
    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }

    /**
     * 获取真实姓名
     *
     * @return nickName - 真实姓名
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置真实姓名
     *
     * @param nickName 真实姓名
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取最后登录时间
     *
     * @return lastLoginDate - 最后登录时间
     */
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastLoginDate 最后登录时间
     */
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    /**
     * 获取登录的token
     *
     * @return token - 登录的token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置登录的token
     *
     * @param token 登录的token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取具体地址
     *
     * @return address - 具体地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置具体地址
     *
     * @param address 具体地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取所在区名称
     *
     * @return areaName - 所在区名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 设置所在区名称
     *
     * @param areaName 所在区名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * 获取区编码
     *
     * @return area - 区编码
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置区编码
     *
     * @param area 区编码
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 获取所在市
     *
     * @return city - 所在市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置所在市
     *
     * @param city 所在市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取所在省名称
     *
     * @return provinceName - 所在省名称
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 设置所在省名称
     *
     * @param provinceName 所在省名称
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * 获取所在省编码
     *
     * @return province - 所在省编码
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置所在省编码
     *
     * @param province 所在省编码
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取用户头像图片地址
     *
     * @return headImg - 用户头像图片地址
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 设置用户头像图片地址
     *
     * @param headImg 用户头像图片地址
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }
}