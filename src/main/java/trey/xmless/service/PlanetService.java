package trey.xmless.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trey.xmless.dao.IPlanetDao;
import trey.xmless.model.Planet;

@Service
public class PlanetService implements IPlanetService {

	@Autowired
	private IPlanetDao planetDao;

	public String getPlanetName(Long planetId) {
		Planet p = planetDao.getPlanet(planetId);
		return p == null ? null : p.getName();
	}

}
