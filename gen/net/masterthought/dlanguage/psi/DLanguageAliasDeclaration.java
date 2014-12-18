// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageAliasDeclaration extends PsiElement {

  @NotNull
  List<DLanguageAliasInitializer> getAliasInitializerList();

  @Nullable
  DLanguageLinkageAttribute getLinkageAttribute();

  @Nullable
  DLanguageType getType();

  @Nullable
  PsiElement getIdentifier();

  @NotNull
  PsiElement getKwAlias();

  @NotNull
  PsiElement getSemicolon();

}
