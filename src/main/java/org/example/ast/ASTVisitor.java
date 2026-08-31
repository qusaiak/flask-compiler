package org.example.ast;

public interface ASTVisitor {
    // أضف دالة visit لكل نوع عقدة لديك في المشروع
    void visit(ASTNode node);
    // مثال لعقد محددة:
    // void visit(VarDeclNode node);
    // void visit(IfNode node);
}