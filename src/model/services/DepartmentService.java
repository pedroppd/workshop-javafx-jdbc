package model.services;

import java.util.List;

import gui.utils.Alerts;
import javafx.scene.control.Alert.AlertType;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	private DepartmentDao dao = DaoFactory.createDepartmentDao();

	public List<Department> findAll() {
		return dao.findAll();
	}

	public void saveOrUpdate(Department obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
			Alerts.showAlert("SUCESSO", null, "Departamento inserido com sucesso!!", AlertType.CONFIRMATION);
		} else {
			dao.update(obj);
			Alerts.showAlert("SUCESSO", null, "Departamento atualizado com sucesso!!", AlertType.CONFIRMATION);
		}
	}
	
	public void remove(Department obj) {
		dao.deleteById(obj.getId());
		Alerts.showAlert("SUCESSO", null, "Departamento removido com sucesso!!", AlertType.CONFIRMATION);
	}
}
