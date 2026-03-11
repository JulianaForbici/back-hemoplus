/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.mydomain.myservice;

import java.util.Map;

import br.com.senior.messaging.Message;

/**
 * Normalizers for payloads accepted/produced by endpoints in my_service.
 */
public class MyServiceNormalizer {
    
    /**
     * Normalizes the Usuario payload.
     */
    public static void normalize(Usuario toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Usuario.Id payload.
     */
    public static void normalize(Usuario.Id toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Hemocentro payload.
     */
    public static void normalize(Hemocentro toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Hemocentro.Id payload.
     */
    public static void normalize(Hemocentro.Id toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Agendamento payload.
     */
    public static void normalize(Agendamento toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    		String entityParentId = headers.containsKey(Message.ENTITY_PARENT_ID_HEADER) ? headers.get(Message.ENTITY_PARENT_ID_HEADER).toString() : null;
    		if (entityParentId != null && toNormalize != null && toNormalize.usuario == null) {
    		    toNormalize.usuario = new Usuario();
    		    toNormalize.usuario.id = entityParentId;
    		}
    	}
    }
    /**
     * Normalizes the Agendamento.Id payload.
     */
    public static void normalize(Agendamento.Id toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Doacao payload.
     */
    public static void normalize(Doacao toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    		String entityParentId = headers.containsKey(Message.ENTITY_PARENT_ID_HEADER) ? headers.get(Message.ENTITY_PARENT_ID_HEADER).toString() : null;
    		if (entityParentId != null && toNormalize != null && toNormalize.usuario == null) {
    		    toNormalize.usuario = new Usuario();
    		    toNormalize.usuario.id = entityParentId;
    		}
    	}
    }
    /**
     * Normalizes the Doacao.Id payload.
     */
    public static void normalize(Doacao.Id toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    /**
     * Normalizes the Estoque payload.
     */
    public static void normalize(Estoque toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    		String entityParentId = headers.containsKey(Message.ENTITY_PARENT_ID_HEADER) ? headers.get(Message.ENTITY_PARENT_ID_HEADER).toString() : null;
    		if (entityParentId != null && toNormalize != null && toNormalize.hemocentro == null) {
    		    toNormalize.hemocentro = new Hemocentro();
    		    toNormalize.hemocentro.id = entityParentId;
    		}
    	}
    }
    /**
     * Normalizes the Estoque.Id payload.
     */
    public static void normalize(Estoque.Id toNormalize, Map<String, Object> headers) {
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toNormalize != null && toNormalize.id == null) {
    			toNormalize.id = entityId;
    		}
    	}
    }
    
}
