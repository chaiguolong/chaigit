package net.jeeshop.services.manage.notifyTemplate.impl;import net.jeeshop.core.ServersManager;import net.jeeshop.services.manage.notifyTemplate.NotifyTemplateService;import net.jeeshop.services.manage.notifyTemplate.bean.NotifyTemplate;import net.jeeshop.services.manage.notifyTemplate.dao.NotifyTemplateDao;public class NotifyTemplateServiceImpl extends ServersManager<NotifyTemplate>		implements NotifyTemplateService {	private NotifyTemplateDao notifyTemplateDao;	public void setNotifyTemplateDao(NotifyTemplateDao notifyTemplateDao) {		this.notifyTemplateDao = notifyTemplateDao;	}}