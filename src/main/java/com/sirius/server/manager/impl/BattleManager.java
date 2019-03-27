package com.sirius.server.manager.impl;

import com.sirius.server.manager.Manager;
import org.springframework.stereotype.Component;

@Component
public class BattleManager implements Manager {
	
	@Override
	public void init() {
		logger.info("BattleManager init");
	}

	@Override
	public void destroy() {
		logger.info("BattleManager destroy");
	}
}