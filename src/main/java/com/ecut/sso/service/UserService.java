package com.ecut.sso.service;

import com.ecut.common.pojo.TaotaoResult;
import com.ecut.pojo.TbUser;

public interface UserService {

	TaotaoResult checkData(String data, int type);
	TaotaoResult register(TbUser user);
	TaotaoResult login(String username, String password);
	TaotaoResult getUserByToken(String token);
}
