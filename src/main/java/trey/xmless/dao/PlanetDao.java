package trey.xmless.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import trey.xmless.model.Planet;

@Component
public class PlanetDao extends JdbcDaoSupport implements IPlanetDao {

	@Autowired
	public PlanetDao(DataSource dataSource) {
		super();
		setDataSource(dataSource);
	}

	public Planet getPlanet(Long planetId) {
		List<Planet> list = getJdbcTemplate().query("select * from planets where planet_id = ?",
				new Object[] { planetId }, new PlanetRowMapper());
		return list.isEmpty() ? null : list.get(0);
	}

	private static class PlanetRowMapper implements RowMapper<Planet> {
		public Planet mapRow(ResultSet rs, int rowNum) throws SQLException {
			Planet p = new Planet();
			p.setId(rs.getLong("planet_id"));
			p.setName(rs.getString("name"));
			return p;
		}
	}

}
