package net.jeeshop.web.action.manage.questionnaireItem;import net.jeeshop.core.BaseAction;import net.jeeshop.services.manage.questionnaireItem.QuestionnaireItemService;import net.jeeshop.services.manage.questionnaireItem.bean.QuestionnaireItem;/** * 问卷调查 * @author Administrator * */@Deprecatedpublic class QuestionnaireItemAction extends BaseAction<QuestionnaireItem> {	private static final long serialVersionUID = 1L;	private QuestionnaireItemService questionnaireItemService;	public QuestionnaireItemService getQuestionnaireItemService() {		return questionnaireItemService;	}	protected void selectListAfter() {		pager.setPagerUrl("questionnaireItem!selectList.action");	}	public void setQuestionnaireItemService(			QuestionnaireItemService questionnaireItemService) {		this.questionnaireItemService = questionnaireItemService;	}	public QuestionnaireItem getE() {		return this.e;	}	public void prepare() throws Exception {		if (this.e == null) {			this.e = new QuestionnaireItem();		}	}	public void insertAfter(QuestionnaireItem e) {		e.clear();	}}