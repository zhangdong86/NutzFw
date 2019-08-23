package com.nutzfw.core.plugin.flowable.factory;

import com.nutzfw.core.plugin.flowable.delegate.CustomClassDelegate;
import org.flowable.bpmn.model.MapExceptionEntry;
import org.flowable.common.engine.api.delegate.Expression;
import org.flowable.engine.impl.bpmn.helper.ClassDelegate;
import org.flowable.engine.impl.bpmn.helper.DefaultClassDelegateFactory;
import org.flowable.engine.impl.bpmn.parser.FieldDeclaration;
import org.nutz.ioc.Ioc;

import java.util.List;

/**
 * @author huchuc@vip.qq.com
 * @date: 2019/8/8
 */
public class CustomClassDelegateFactory extends DefaultClassDelegateFactory {

    private Ioc ioc;

    public CustomClassDelegateFactory(Ioc ioc) {
        this.ioc = ioc;
    }

    @Override
    public ClassDelegate create(String id, String className, List<FieldDeclaration> fieldDeclarations,
                                boolean triggerable, Expression skipExpression, List<MapExceptionEntry> mapExceptions) {
        return new CustomClassDelegate(ioc,id, className, fieldDeclarations, triggerable, skipExpression, mapExceptions);
    }

    @Override
    public ClassDelegate create(String className, List<FieldDeclaration> fieldDeclarations) {
        return new CustomClassDelegate(ioc,className, fieldDeclarations);
    }
}
