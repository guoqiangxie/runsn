package com.runsn.jdbc;

import com.runsn.dto.DocumentType;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Title: TypeDao
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
public class TypeDao {

    public static DocumentType query(int id) {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select * from document_type t where t.id = " + id;
        return jdbcTemplate.query(sql, new ResultSetExtractor<DocumentType>() {
            @Override
            public DocumentType extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                DocumentType documentType = new DocumentType();
                while (resultSet.next()) documentType = createType(resultSet);
                return documentType;
            }
        });
    }

    public static List<DocumentType> queryByTitle1code(int title1code) {
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
        String sql = "select * from document_type t where t.active=1 and t.title1code = " + title1code;
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<DocumentType>>() {
            @Override
            public List<DocumentType> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List result = new ArrayList();
                while (resultSet.next()) {
                    result.add(createType(resultSet));
                }
                return result;
            }
        });
    }

    private static DocumentType createType(ResultSet rs) throws SQLException {
        DocumentType type = new DocumentType();
        type.setId(rs.getInt("id"));
        type.setActive(rs.getInt("active"));
        type.setTitle1(rs.getString("title1"));
        type.setTitle1code(rs.getInt("title1code"));
        type.setTitle2(rs.getString("title2"));
        type.setTitle2code(rs.getInt("title2code"));
        type.setTitle3(rs.getString("title3"));
        type.setTitle3code(rs.getInt("title3code"));
        return type;
    }
}
