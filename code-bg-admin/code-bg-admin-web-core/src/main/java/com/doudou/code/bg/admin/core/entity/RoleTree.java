package com.doudou.code.bg.admin.core.entity;

import javax.persistence.*;

@Table(name = "t_role_tree")
public class RoleTree {
    /**
     * 角色菜单关联流水ID
     */
    @Id
    @Column(name = "roleTreeId")
    @GeneratedValue(generator = "JDBC")
    private String roleTreeId;

    /**
     * 角色ID
     */
    @Column(name = "roleId")
    private String roleId;

    /**
     * 菜单ID
     */
    @Column(name = "treeId")
    private Integer treeId;

    /**
     * 获取角色菜单关联流水ID
     *
     * @return roleTreeId - 角色菜单关联流水ID
     */
    public String getRoleTreeId() {
        return roleTreeId;
    }

    /**
     * 设置角色菜单关联流水ID
     *
     * @param roleTreeId 角色菜单关联流水ID
     */
    public void setRoleTreeId(String roleTreeId) {
        this.roleTreeId = roleTreeId;
    }

    /**
     * 获取角色ID
     *
     * @return roleId - 角色ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     *
     * @param roleId 角色ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取菜单ID
     *
     * @return treeId - 菜单ID
     */
    public Integer getTreeId() {
        return treeId;
    }

    /**
     * 设置菜单ID
     *
     * @param treeId 菜单ID
     */
    public void setTreeId(Integer treeId) {
        this.treeId = treeId;
    }
}