package com.api_rest.api_rest_p.Config;
import org.hibernate.envers.RevisionListener;
import com.api_rest.api_rest_p.Entidades.Audit.Revision;

public class CustomRevisionListener implements RevisionListener{
    public void newRevision(Object revisionEntity){
        final Revision revision=(Revision) revisionEntity;
    }
}
