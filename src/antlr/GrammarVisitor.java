// Generated from Grammar.g4 by ANTLR 4.7.2

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link GrammarParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNInicio(GrammarParser.NInicioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NEstrutura}
	 * labeled alternative in {@link GrammarParser#estrutura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNEstrutura(GrammarParser.NEstruturaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NDeclaracaoFuncao}
	 * labeled alternative in {@link GrammarParser#declaracao_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNDeclaracaoFuncao(GrammarParser.NDeclaracaoFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NDeclaracaoVariavel}
	 * labeled alternative in {@link GrammarParser#declaracao_variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNDeclaracaoVariavel(GrammarParser.NDeclaracaoVariavelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NlocoDeclaracaoParametro}
	 * labeled alternative in {@link GrammarParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNlocoDeclaracaoParametro(GrammarParser.NlocoDeclaracaoParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(GrammarParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoDeclaracaoExpressao}
	 * labeled alternative in {@link GrammarParser#bloco_expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoDeclaracaoExpressao(GrammarParser.BlocoDeclaracaoExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoExpressao}
	 * labeled alternative in {@link GrammarParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoExpressao(GrammarParser.BlocoExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoExpressaoIgualdade}
	 * labeled alternative in {@link GrammarParser#expressao_igualdade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoExpressaoIgualdade(GrammarParser.BlocoExpressaoIgualdadeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoExpressaoRelacional}
	 * labeled alternative in {@link GrammarParser#expressao_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoExpressaoRelacional(GrammarParser.BlocoExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoExpressaoSoma}
	 * labeled alternative in {@link GrammarParser#expressao_soma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoExpressaoSoma(GrammarParser.BlocoExpressaoSomaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoExpressaoMultiplicacao}
	 * labeled alternative in {@link GrammarParser#expressao_multiplicacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoExpressaoMultiplicacao(GrammarParser.BlocoExpressaoMultiplicacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoExpressaoUnaria}
	 * labeled alternative in {@link GrammarParser#expressao_unaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoExpressaoUnaria(GrammarParser.BlocoExpressaoUnariaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoExpressaoPrimaria}
	 * labeled alternative in {@link GrammarParser#expressao_primaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoExpressaoPrimaria(GrammarParser.BlocoExpressaoPrimariaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoExpressaoImpressao}
	 * labeled alternative in {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoExpressaoImpressao(GrammarParser.BlocoExpressaoImpressaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoRetorno}
	 * labeled alternative in {@link GrammarParser#bloco_retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoRetorno(GrammarParser.BlocoRetornoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NLeitura}
	 * labeled alternative in {@link GrammarParser#leitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNLeitura(GrammarParser.NLeituraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoCondicional}
	 * labeled alternative in {@link GrammarParser#bloco_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoCondicional(GrammarParser.BlocoCondicionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoRepeticao}
	 * labeled alternative in {@link GrammarParser#bloco_rep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoRepeticao(GrammarParser.BlocoRepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoPrincipal}
	 * labeled alternative in {@link GrammarParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoPrincipal(GrammarParser.BlocoPrincipalContext ctx);
}