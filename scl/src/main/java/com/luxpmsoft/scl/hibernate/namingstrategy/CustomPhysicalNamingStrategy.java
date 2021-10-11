package com.luxpmsoft.scl.hibernate.namingstrategy;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class CustomPhysicalNamingStrategy implements PhysicalNamingStrategy {

	@Override
	public Identifier toPhysicalCatalogName(Identifier identifier, JdbcEnvironment arg1) {
		return convertToSnakeCase(identifier);
	}

	@Override
	public Identifier toPhysicalColumnName(Identifier identifier, JdbcEnvironment arg1) {
		return convertToSnakeCase(identifier);
	}

	@Override
	public Identifier toPhysicalSchemaName(Identifier identifier, JdbcEnvironment arg1) {
		return convertToSnakeCase(identifier);
	}

	@Override
	public Identifier toPhysicalSequenceName(Identifier identifier, JdbcEnvironment arg1) {
		return convertToSnakeCase(identifier);
	}

	@Override
	public Identifier toPhysicalTableName(Identifier identifier, JdbcEnvironment arg1) {
		return convertToSnakeCase(identifier);
	}
	
	private Identifier convertToSnakeCase(final Identifier identifier) {
        final String regex = "([a-z])([A-Z])";
        final String replacement = "$1_$2";
        final String newName = identifier.getText()
          .replaceAll(regex, replacement)
          .toLowerCase();
        return Identifier.toIdentifier(newName);
    }

}
