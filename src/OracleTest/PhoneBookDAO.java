package OracleTest;

import java.util.List;

public interface PhoneBookDAO {

	 	public List<PhoneBookVO> getList();
	    public PhoneBookVO get(Long id);
	    public boolean insert(PhoneBookVO pvo);
	    public boolean update(PhoneBookVO pvo);
	    public boolean delete(Long id);
}
