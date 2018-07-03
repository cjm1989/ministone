package kr.co.ministone.dao;
 
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import kr.co.ministone.dto.UserDTO;
import kr.co.ministone.dao.IMemberDao;
 
@Service
public class MemberService {
    @Inject
    private IMemberDao memberDao;
    
    public void setMemberDao(IMemberDao memberDao) {
		this.memberDao = memberDao;
	}
 
    
    public String getData(){
        return "I am a boy";
    }
    public List<HashMap<String, Object>> selectAll() {
        return memberDao.selectAll();
    }
 
//    public void joinMember(String id, String pwd, String pwd_Check, String name, String email, String phone, String admin){
//        HashMap<String, Object> params = new HashMap<String,Object>();
//        
//        if(pwd.equals(pwd_Check))
//        {
//            params.put(Constant.Member.USERID, id);
//            params.put(Constant.Member.PWD, pwd);
//            params.put(Constant.Member.NAME, name);
//            params.put(Constant.Member.EMAIL, email);
//            params.put(Constant.Member.PHONE, phone);
//            params.put(Constant.Member.ADMIN, admin);
//            memberDao.insertMember(params);
//        }
//        
//    }
    
    public void joinMember(HashMap<String, Object> params){
        
        if(params.get("pwd").equals(params.get("pwd_CHECK")))
        {
            memberDao.insertMember(params);
        }
    }
    
    
    public boolean login(String username, String pw){
        HashMap<String, Object> result = memberDao.selectOne(username);
        if(result == null)
            return false;
        else 
        {
            String oPwd = (String) result.get(pw);
            if(oPwd==null)
                return false;
            else{
                if(oPwd.equals(pw))
                    return true;
                else
                    return false;
            }
            
        }
    }
    
    //회원 한명의 정보를 가져다주는 
    public HashMap<String, Object> getMemberInfo(String id){
        return memberDao.selectOne(id);
    }
    
/*    public void memberUpdate(HashMap<String, Object> params){
 
        if(params.get("pw").equals(params.get("pw_CHECK")))
        {
            HashMap<String, Object> record = memberDao.selectOne((String)params.get);
            record.putAll(params); //원래있던거에 내가 받은걸로 수정
            memberDao.updateMember(record);
        }
    }*/
}


