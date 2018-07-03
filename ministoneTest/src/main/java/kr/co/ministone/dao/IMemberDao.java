package kr.co.ministone.dao;

import java.util.HashMap;
import java.util.List;
 
public interface IMemberDao {
    public int insertMember(HashMap<String, Object> params);
    public int updateMember(HashMap<String, Object> params);
    public int deleteMember(String username);
    public HashMap<String, Object> selectOne(String username);
    public List<HashMap<String, Object>> selectAll();
}

