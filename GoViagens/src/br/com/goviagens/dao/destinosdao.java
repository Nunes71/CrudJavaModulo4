package br.com.goviagens.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.goviagens.factory.ConnectionFactoryGoViagens;
import br.com.goviagens.model.Destinos;

public class destinosdao {
	public void save (Destinos destinos) {
		String sql = "INSERT INTO Destinos(cidade, preço)" + "VALUES(?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = ConnectionFactoryGoViagens.createConnectionSQLServer();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setString (1 , destinos.getCidade());
			pstm.setInt (2 , destinos.getPreco());
			pstm.execute();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null ) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

	public void removeById(int id) {
		String sql = "DELETE FROM destinos WHERE id = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = ConnectionFactoryGoViagens.createConnectionSQLServer();
			pstm = conn.prepareStatement(sql);
			pstm.setInt (1, id);
			pstm.execute();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

	public void update ( Destinos destino) {
		
		String sql= " UPDATE destinos SET cidade = ?, preço=?" + "Where id=? ";
		
		Connection conn = null;
		PreparedStatement pstm = null;
	try {
			
			conn = ConnectionFactoryGoViagens.createConnectionSQLServer();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setString (1 , destinos.getCidade());
			pstm.setString (2 , destinos.getPreco());
			
			
			
			pstm.execute();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null ) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Destinos> getDestinos() {
		
		String sql="SELECT * from destinos";
		
		List<Destinos> contato = new ArrayList<Destinos>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
			try {
			
			conn = ConnectionFactoryGoViagens.createConnectionSQLServer();
			pstm = conn.prepareStatement(sql);
			rset= pstm.executeQuery();
			
			while (rset.next()){
				
				Destinos destinos= new Destinos();
				
				destinos.setId(rset.getInt("id"));
				destinos.setCidade(rset.getString("Cidade"));
				destinos.setPreco(rset.getInt("Preco"));
				
				destino.add(destinos);
				
				
			}
		

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null ) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			return destino;
	}

	
}
