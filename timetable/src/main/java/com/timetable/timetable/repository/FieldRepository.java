package com.timetable.timetable.repository;
import org.springframework.data.repository.CrudRepository;

import com.timetable.timetable.model.Field;

public interface FieldRepository extends CrudRepository<Field,Long>{

	
	/*private EntityManager entityManager;

	public FieldRepository(EntityManager entityManager){
		this.entityManager = entityManager;
	}

	public Field editar(Field e) {
		entityManager.merge(e);
	    this.entityManager.flush();
		return e;
	}

	public Field adicionar(Field e) {
		entityManager.persist(e);
	    this.entityManager.flush();
		return e;
	}

	public Field remover(Field e) {
		Field temp = new Field();
	    temp = this.entityManager.find(Field.class, e.getId());
	    this.entityManager.remove(temp);
		return e;
	}

    @SuppressWarnings("unchecked")
	public List getEixos() {
		return this.entityManager.createNamedQuery(Definicoes.EIXO_LISTAR).getResultList();
	}

    public Long getCount() {
        return (Long) this.entityManager.createNamedQuery(Definicoes.EIXO_COUNT)
                .getSingleResult();
    }
    
    public Field buscar(Integer ID){
        return this.entityManager.find(Field.class, ID);
    }*/
}
